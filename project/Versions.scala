object Versions extends WebJarsVersions with ScalaJSVersions with SharedVersions
{
	val scala = "2.11.7"

	val akkaHttp = "1.0-RC4"

	val bcrypt = "2.4"

	val ammonite = "0.3.2"

	val apacheCodec = "1.10"

	val akkaHttpExtensions = "0.0.4"+"-RC4" //just to mention that it depends on akka-http RC4

	val controls = "0.0.4"
}

trait ScalaJSVersions {

	val selectizeFacade = "0.12.1-0.2.0"

	val jqueryFacade = "0.6"

	val jsext = "0.5"

	val dom = "0.8.1"

	val codemirrorFacade = "5.3-0.5"

	val binding = "0.7.17"

}

//versions for libs that are shared between client and server
trait SharedVersions
{
	val autowire = "0.2.5"

	val scalaRx = "0.2.8"

	val quicklens = "1.3.1"

	val scalaTags = "0.5.2"

	val scalaCSS = "0.3.0"

	val productCollections = "1.4.2"

	val scalaTest = "3.0.0-M6"

}


trait WebJarsVersions{

	val jquery =  "2.1.3"

	val semanticUI = "2.0.0"

	val codemirror = "5.3"

	val selectize = "0.12.1"

}

