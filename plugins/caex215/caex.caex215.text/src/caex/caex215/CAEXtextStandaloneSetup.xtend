/*
 * generated by Xtext 2.10.0
 */
package caex.caex215


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class CAEXtextStandaloneSetup extends CAEXtextStandaloneSetupGenerated {

	def static void doSetup() {
		new CAEXtextStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}