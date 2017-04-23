package htmldsl

package object string extends string.Imports {
  def notSupportedInStringBackend() = throw new Exception("Not supported in string backend")
}
