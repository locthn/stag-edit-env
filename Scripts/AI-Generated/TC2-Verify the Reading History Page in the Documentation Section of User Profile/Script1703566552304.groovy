import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page home --> navigate to Page docs your-profile reading-history'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/docs/your-profile/reading-history')

'step 2: Add visual checkpoint at Page docs your-profile reading-history'

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify the Reading History Page in the Documentation Section of User Profile_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
