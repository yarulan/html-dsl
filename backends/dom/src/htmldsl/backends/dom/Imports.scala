package htmldsl.backends.dom

trait Imports extends htmldsl.Imports {
  implicit val backend = DomBackend
}