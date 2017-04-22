package htmldsl

package object string {
  def notSupportedInStringBackend() = throw new Exception("Not supported in string backend")
}
