package htmldsl.dom

import scala.scalajs.js

@js.native
trait Window
  extends EventTarget with WindowLocalStorage with WindowSessionStorage
    with WindowTimers with WindowBase64 with IDBEnvironment
    with WindowConsole {
  var ondragend: js.Function1[DragEvent, _] = js.native

  /**
   * An event handler property for keydown events on the window.
   *
   * MDN
   */
  var onkeydown: js.Function1[KeyboardEvent, _] = js.native
  var ondragover: js.Function1[DragEvent, _] = js.native

  /**
   * An event handler property for keyup events on the window.
   *
   * MDN
   */
  var onkeyup: js.Function1[KeyboardEvent, _] = js.native

  /**
   * An event handler property for reset events on the window.
   *
   * MDN
   */
  var onreset: js.Function1[Event, _] = js.native

  /**
   * An event handler property for mouseup events on the window.
   *
   * MDN
   */
  var onmouseup: js.Function1[MouseEvent, _] = js.native
  var ondragstart: js.Function1[DragEvent, _] = js.native
  var ondrag: js.Function1[DragEvent, _] = js.native

  /**
   * Returns the horizontal distance of the left border of the user's browser from the
   * left side of the screen.
   *
   * MDN
   */
  var screenX: Int = js.native

  /**
   * An event handler property for mouseover events on the window.
   *
   * MDN
   */
  var onmouseover: js.Function1[MouseEvent, _] = js.native
  var ondragleave: js.Function1[DragEvent, _] = js.native

  /**
   * The Window.history read-only property returns a reference to the History object,
   * which provides an interface for manipulating the browser session history (pages
   * visited in the tab or frame that the current page is loaded in).
   *
   * MDN
   */
  def history: History = js.native

  /**
   * Returns the number of pixels that the document has already been scrolled
   * horizontally.
   *
   * MDN
   */
  def pageXOffset: Double = js.native

  /**
   * The name of the window is used primarily for setting targets for hyperlinks and
   * forms. Windows do not need to have names.
   *
   * MDN
   */
  var name: String = js.native

  /**
   * The onafterprint property sets and returns the onafterprint event handler code
   * for the current window.
   *
   * MDN
   */
  var onafterprint: js.Function1[Event, _] = js.native
  var onpause: js.Function1[Event, _] = js.native

  /**
   * The onbeforeprint property sets and returns the onbeforeprint event handler code
   * for the current window.
   *
   * MDN
   */
  var onbeforeprint: js.Function1[Event, _] = js.native

  /**
   * Returns a reference to the topmost window in the window hierarchy. This property is
   * read only.
   *
   * MDN
   */
  def top: Window = js.native

  /**
   * An event handler property for mousedown events on the window.
   *
   * MDN
   */
  var onmousedown: js.Function1[MouseEvent, _] = js.native
  var onseeked: js.Function1[Event, _] = js.native

  /**
   * Returns a reference to the window that opened this current window.
   *
   * MDN
   */
  var opener: Window = js.native

  /**
   * Called when the user clicks the mouse button while the cursor is in the window. This
   * event is fired for any mouse button pressed; you can look at the event properties to
   * find out which button was pressed and where.
   *
   * MDN
   */
  var onclick: js.Function1[MouseEvent, _] = js.native

  /**
   * Gets the width of the content area of the browser window including, if rendered, the
   * vertical scrollbar.
   *
   * MDN
   */
  def innerWidth: Double = js.native

  /**
   * Gets the height of the content area of the browser window including, if rendered,
   * the horizontal scrollbar.
   *
   * MDN
   */
  def innerHeight: Double = js.native

  var onwaiting: js.Function1[Event, _] = js.native
  var ononline: js.Function1[Event, _] = js.native
  var ondurationchange: js.Function1[Event, _] = js.native

  /**
   * Returns the window itself, which is an array-like object, listing the direct
   * sub-frames of the current window.
   *
   * MDN
   */
  def frames: Window = js.native

  /**
   * The onblur property can be used to set the blur handler on the window, which is
   * triggered when the window loses focus.
   *
   * MDN
   */
  var onblur: js.Function1[FocusEvent, _] = js.native
  var onemptied: js.Function1[Event, _] = js.native
  var onseeking: js.Function1[Event, _] = js.native
  var oncanplay: js.Function1[Event, _] = js.native

  /**
   * window.outerWidth gets the width of the outside of the browser window. It
   * represents the width of the whole browser window including sidebar (if expanded),
   * window chrome and window resizing borders/handles.
   *
   * MDN
   */
  def outerWidth: Int = js.native

  var onstalled: js.Function1[Event, _] = js.native

  /**
   * An event handler property for mousemove events on the window.
   *
   * MDN
   */
  var onmousemove: js.Function1[MouseEvent, _] = js.native

  var onoffline: js.Function1[Event, _] = js.native

  /**
   * Returns the number of frames (either frame or iframe elements) in the window.
   *
   * MDN
   */
  def length: Int = js.native

  /**
   * Specifies the height of the screen, in pixels, minus permanent or semipermanent
   * user interface features displayed by the operating system, such as the Taskbar on
   * Windows.
   *
   * MDN
   */
  def screen: Screen = js.native

  /**
   * An event that fires when a window is about to unload its resources. The document is
   * still visible and the event is still cancelable.
   *
   * MDN
   */
  var onbeforeunload: js.Function1[BeforeUnloadEvent, _] = js.native
  var onratechange: js.Function1[Event, _] = js.native
  var onstorage: js.Function1[StorageEvent, _] = js.native
  var onloadstart: js.Function1[Event, _] = js.native

  /**
   * Called for an element when the mouse pointer first moves over the element while
   * something is being dragged. This might be used to change the appearance of the
   * element to indicate to the user that the object can be dropped on it.
   *
   * MDN
   */
  var ondragenter: js.Function1[DragEvent, _] = js.native

  /**
   * An event handler property for submits on window forms.
   *
   * MDN
   */
  var onsubmit: js.Function1[Event, _] = js.native

  /**
   * Returns an object reference to the window object itself.
   *
   * MDN
   */
  def self: Window = js.native

  /**
   * Returns a reference to the document that the window contains.
   *
   * MDN
   */
  def document: HTMLDocument = js.native

  var onprogress: js.Function1[js.Any, _] = js.native
  var ondblclick: js.Function1[MouseEvent, _] = js.native

  /**
   * Returns the number of pixels that the document has already been scrolled
   * vertically.
   *
   * MDN
   */
  def pageYOffset: Double = js.native

  /**
   * An event handler property for right-click events on the window.
   *
   * MDN
   */
  var oncontextmenu: js.Function1[MouseEvent, _] = js.native

  /**
   * An event handler property for change events on the window.
   *
   * MDN
   */
  var onchange: js.Function1[Event, _] = js.native
  var onloadedmetadata: js.Function1[Event, _] = js.native
  var onplay: js.Function1[Event, _] = js.native

  /**
   * An event handler property for errors raised on the window.
   *
   * MDN
   */
  var onerror: js.Function4[Event, String, Int, Int, _] = js.native
  var onplaying: js.Function1[Event, _] = js.native

  /**
   * Returns a reference to the parent of the current window or subframe.
   *
   * MDN
   */
  def parent: Window = js.native

  /**
   * The Window.location property returns a Location object with
   * information about the current location of the document.
   *
   * MDN
   */
  var location: Location = js.native
  var oncanplaythrough: js.Function1[Event, _] = js.native

  /**
   * An event handler property for abort events on the window.
   *
   * MDN
   */
  var onabort: js.Function1[UIEvent, _] = js.native
  var onreadystatechange: js.Function1[Event, _] = js.native

  /**
   * window.outerHeight gets the height in pixels of the whole browser window. It
   * represents the height of the whole browser window including sidebar (if
   * expanded), window chrome and window resizing borders/handles.
   *
   * MDN
   */
  def outerHeight: Int = js.native

  /**
   * An event handler property for keypress events on the window.
   *
   * MDN
   */
  var onkeypress: js.Function1[KeyboardEvent, _] = js.native

  /**
   * Returns the element (such as &lt;iframe&gt; or &lt;object&gt;) in which the window is embedded,
   * or null if the window is top-level.
   *
   * MDN
   */
  def frameElement: Element = js.native

  var onloadeddata: js.Function1[Event, _] = js.native
  var onsuspend: js.Function1[Event, _] = js.native

  /**
   * The window property of a window object points to the window object itself.
   *
   * MDN
   */
  def window: Window = js.native

  /**
   * An event handler property for focus events on the window.
   *
   * MDN
   */
  var onfocus: js.Function1[FocusEvent, _] = js.native
  var onmessage: js.Function1[MessageEvent, _] = js.native
  var ontimeupdate: js.Function1[Event, _] = js.native

  /**
   * An event handler for the resize event on the window.
   *
   * MDN
   */
  var onresize: js.Function1[UIEvent, _] = js.native

  /**
   * An event handler property for window selection.
   *
   * MDN
   */
  var onselect: js.Function1[UIEvent, _] = js.native

  /**
   * The Window.navigator read-only property returns a reference to the Navigator
   * object, which can be queried for information about the application running the
   * script.
   *
   * MDN
   */
  def navigator: Navigator = js.native

  def styleMedia: StyleMedia = js.native

  var ondrop: js.Function1[DragEvent, _] = js.native

  /**
   * An event handler property for mouseout events on the window.
   *
   * MDN
   */
  var onmouseout: js.Function1[MouseEvent, _] = js.native
  var onended: js.Function1[Event, _] = js.native

  /**
   * An event handler property for hash change events on the window; called when the part
   * of the URL after the hash mark ("#") changes.
   *
   * MDN
   */
  var onhashchange: js.Function1[HashChangeEvent, _] = js.native

  /**
   * The unload event is raised when the window is unloading its content and resources.
   * The resources removal is processed  after the unload event occurs.
   *
   * MDN
   */
  var onunload: js.Function1[Event, _] = js.native

  /**
   * Specifies the function to be called when the window is scrolled.
   *
   * MDN
   */
  var onscroll: js.Function1[UIEvent, _] = js.native

  /**
   * Returns the vertical distance of the top border of the user's browser from the top
   * edge of the screen.
   *
   * MDN
   */
  def screenY: Int = js.native

  var onmousewheel: js.Function1[WheelEvent, _] = js.native

  /**
   * An event handler property for window loading.
   *
   * MDN
   */
  var onload: js.Function1[Event, _] = js.native
  var onvolumechange: js.Function1[Event, _] = js.native
  var oninput: js.Function1[Event, _] = js.native

  /**
   * The Web Performance API allows web pages access to certain functions for measuring
   * the performance of web pages and web applications, including the Navigation
   * Timing API and high-resolution time data.
   *
   * MDN
   */
  def performance: Performance = js.native

  def alert(message: String): Unit = js.native

  /**
   * The Window.alert() method displays an alert dialog with the optional specified
   * content and an OK button.
   *
   * MDN
   */
  def alert(): Unit = js.native

  /**
   * Scrolls the window to a particular place in the document.
   *
   * MDN
   */
  def scroll(x: Int, y: Int): Unit = js.native

  /**
   * Makes a request to bring the window to the front. It may fail due to user settings and
   * the window isn't guaranteed to be frontmost before this method returns.
   *
   * MDN
   */
  def focus(): Unit = js.native

  /**
   * Scrolls to a particular set of coordinates in the document.
   *
   * MDN
   */
  def scrollTo(x: Int, y: Int): Unit = js.native

  /**
   * Opens the Print Dialog to print the current document.
   *
   * MDN
   */
  def print(): Unit = js.native

  def prompt(message: String, default: String = js.native): String = js.native

  /**
   * The Window.prompt() displays a dialog with an optional message prompting the user
   * to input some text.
   *
   * MDN
   */
  def prompt(): String = js.native

  /**
   * Loads a resource in a new browsing context or an existing one.
   *
   * MDN
   */
  def open(url: String = js.native, target: String = js.native,
    features: String = js.native,
    replace: Boolean = js.native): Window = js.native

  /**
   * Scrolls the document in the window by the given amount.
   *
   * MDN
   */
  def scrollBy(x: Int, y: Int): Unit = js.native

  /**
   * The Window.confirm() method displays a modal dialog with an optional message and
   * two buttons, OK and Cancel.
   *
   * MDN
   */
  def confirm(message: String = js.native): Boolean = js.native

  /**
   * Closes the current window, or a referenced window.
   *
   * MDN
   */
  def close(): Unit = js.native

  /**
   * The window.postMessage method safely enables cross-origin communication.
   * Normally, scripts on different pages are allowed to access each other if and only if
   * the pages that executed them are at locations with the same protocol (usually both
   * http), port number (80 being the default for http), and host (modulo
   * document.domain being set by both pages to the same value). window.postMessage
   * provides a controlled mechanism to circumvent this restriction in a way which is
   * secure when properly used.
   *
   * MDN
   */
  def postMessage(message: js.Any, targetOrigin: String,
    transfer: js.Any = js.native): Unit = js.native

  /**
   * The Window.showModalDialog() creates and displays a modal dialog box containing
   * a specified HTML document.
   *
   * @param url The URI of the document to display in the dialog box
   * @param argument An optional variant the contains values that should be passed to the
   *                 dialog box; these are made available in the `window` object's
   *                 `dialogArguments` property.
   * @param options An optional String that specifies window ornamentation
   */
  def showModalDialog(url: String = js.native, argument: js.Any = js.native,
    options: js.Any = js.native): js.Dynamic = js.native

  /**
   * The window.blur() method is the programmatic equivalent of the user shifting
   * focus away from the current window.
   *
   * MDN
   */
  def blur(): Unit = js.native

  /**
   * Returns a selection object representing the range of text selected by the user.
   *
   * MDN
   */
  def getSelection(): Selection = js.native

  def getComputedStyle(elt: Element,
    pseudoElt: String = js.native): CSSStyleDeclaration = js.native

  /**
   * An OfflineResourceList object providing access to the offline resources for the
   * window.
   *
   * MDN
   */
  def applicationCache: ApplicationCache = js.native

  /**
   * An event handler property for popstate events, which are fired when navigating to a
   * session history entry representing a state object.
   *
   * MDN
   */
  var onpopstate: js.Function1[PopStateEvent, _] = js.native

  /**
   * Returns a new MediaQueryList object representing the parsed results of the
   * specified media query string.
   *
   * MDN
   */
  def matchMedia(mediaQuery: String): MediaQueryList = js.native

  /**
   * Cancels an animation frame request previously scheduled through a call to
   * window.requestAnimationFrame().
   *
   * MDN
   */
  def cancelAnimationFrame(handle: Int): Unit = js.native

  /**
   * The window.requestAnimationFrame() method tells the browser that you wish to
   * perform an animation and requests that the browser call a specified function to
   * update an animation before the next repaint. The method takes as an argument a
   * callback to be invoked before the repaint.
   *
   * MDN
   */
  def requestAnimationFrame(callback: js.Function1[Double, _]): Int = js.native

  /**
   * The Window.devicePixelRatio read-only property returns the ratio of the
   * (vertical) size of one physical pixel on the current display device to the
   * size of one device independent pixel (dips).
   *
   * MDN
   */
  def devicePixelRatio: Double = js.native
}
