package htmldsl.dom

import scala.scalajs.js

@js.native
trait IDBFactory extends js.Object {
  def open(name: String, version: Int): IDBOpenDBRequest

  def open(name: String): IDBOpenDBRequest

  def cmp(first: js.Any, second: js.Any): Int

  def deleteDatabase(name: String): IDBOpenDBRequest
}

@js.native
trait IDBOpenDBRequest extends IDBRequest {
  var onupgradeneeded: js.Function1[IDBVersionChangeEvent, _]

  var onblocked: js.Function1[Event, _]
}

@js.native
trait IDBRequest extends EventTarget {
  def source: js.Any

  var onsuccess: js.Function1[Event, _]

  def error: DOMError

  def transaction: IDBTransaction

  var onerror: js.Function1[ErrorEvent, _]

  /**
   * The state of the request. Every request starts in the pending state. The state
   * changes to done when the request completes successfully or when an error occurs.
   *
   * MDN
   */
  def readyState: String

  /**
   * Returns the result of the request. If the the request failed and the result is not
   * available, the InvalidStateError exception is thrown.
   *
   * MDN
   */
  def result: js.Any
}

/**
 * The IDBTransaction interface of the IndexedDB API provides a static,
 * asynchronous transaction on a database using event handler attributes. All
 * reading and writing of data are done within transactions. You actually use
 * IDBDatabase to start transactions and use IDBTransaction to set the mode of
 * the transaction and access an object store and make your request. You can
 * also use it to abort transactions.
 *
 * MDN
 */
@js.native
@JSGlobal
class IDBTransaction extends EventTarget {

  /**
   * The event handler for the oncomplete event.
   *
   * MDN
   */
  var oncomplete: js.Function1[Event, _]

  /**
   * The database connection with which this transaction is associated.
   *
   * MDN
   */
  def db: IDBDatabase

  /**
   * The mode for isolating access to data in the object stores that are in the scope of the
   * transaction. For possible values, see Constants. The default value is readonly.
   *
   * MDN
   */
  def mode: String

  /**
   * The error returned in the event of an unsuccessful transaction. Null if the
   * transaction is not finished, is finished and successfully committed, or was
   * aborted with IDBTransaction.abort function. Returns the same DOMError as the
   * request object which caused the transaction to be aborted due to a failed request,
   * or a DOMError for the transaction failure not due to a failed request (such as
   * QuotaExceededError or UnknownError).
   *
   * MDN
   */
  def error: DOMError

  /**
   * The event handler for the onerror event.
   *
   * MDN
   */
  var onerror: js.Function1[ErrorEvent, _]

  /**
   * The event handler for the onabort event.
   *
   * MDN
   */
  var onabort: js.Function1[Event, _]

  /**
   * Returns immediately, and rolls back all the changes to objects in the database
   * associated with this transaction. If this transaction has been aborted or
   * completed, then this method throws an error event.
   *
   * MDN
   */
  def abort(): Unit

  /**
   * Every call to this method on the same transaction object, with the same name,
   * returns the same IDBObjectStore instance. If this method is called on a different
   * transaction object, a different IDBObjectStore instance is returned.
   *
   * MDN
   */
  def objectStore(name: String): IDBObjectStore
}


/**
 * The IDBObjectStore interface of the IndexedDB API represents an object store in
 * a database. Records within an object store are sorted according to their keys.
 * This sorting enables fast insertion, look-up, and ordered retrieval.
 *
 * MDN
 */
@js.native
@JSGlobal
class IDBObjectStore extends js.Object {

  /**
   * A list of the names of indexes on objects in this object store.
   *
   * MDN
   */
  def indexNames: DOMStringList

  def name: String

  /**
   * The name of the transaction to which this object store belongs.
   *
   * MDN
   */
  def transaction: IDBTransaction

  /**
   * The key path of this object store. If this attribute is null, the application must
   * provide a key for each modification operation.
   *
   * MDN
   */
  def keyPath: String

  def count(key: js.Any): IDBRequest

  /**
   * To determine if the add operation has completed successfully, listen for the
   * transaction’s complete event in addition to the IDBObjectStore.add request’s
   * success event, because the transaction may still fail after the success event
   * fires. In other words, the success event is only triggered when the transaction has
   * been successfully queued.
   *
   * MDN
   */
  def add(value: js.Any, key: js.Any): IDBRequest

  /**
   * Clearing an object store consists of removing all records from the object store and
   * removing all records in indexes that reference the object store.
   *
   * MDN
   */
  def clear(): IDBRequest

  /**
   * Note that this method must be called only from a VersionChange transaction mode
   * callback.
   *
   * MDN
   */
  def createIndex(name: String, keyPath: String,
    optionalParameters: js.Any): IDBIndex

  /**
   * If the record is successfully stored, then a success event is fired on the returned
   * request object with the result set to the key for the stored record, and the
   * transaction set to the transaction in which this object store is opened.
   *
   * MDN
   */
  def put(value: js.Any, key: js.Any): IDBRequest

  def openCursor(range: js.Any,
    direction: String): IDBRequest

  /**
   * Note that this method must be called only from a VersionChange transaction mode
   * callback. Note that this method synchronously modifies the
   * IDBObjectStore.indexNames property.
   *
   * MDN
   */
  def deleteIndex(indexName: String): Unit

  /**
   * This method may raise a DOMException with a DOMError of the following types:
   *
   * MDN
   */
  def index(name: String): IDBIndex

  /**
   * If a value is successfully found, then a structured clone of it is created and set as
   * the result of the request object.
   *
   * MDN
   */
  def get(key: js.Any): IDBRequest

  /**
   * returns an IDBRequest object, and, in a separate thread, deletes the current
   * object store.
   *
   * MDN
   */
  def delete(key: js.Any): IDBRequest
}

/**
 * The specification has changed and some not up-to-date browsers only support the
 * deprecated unique attribute, version, from an early draft version.
 *
 * MDN
 */
@js.native
class IDBVersionChangeEvent extends Event {

  /**
   * Returns the new version of the database.
   *
   * MDN
   */
  def newVersion: Int = js.native

  /**
   * Returns the old version of the database.
   *
   * MDN
   */
  def oldVersion: Int = js.native
}
