package com.kms.katalon.keyword.testlink

import org.apache.commons.lang3.StringUtils

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.setting.BundleSettingStore
import com.kms.katalon.core.util.KeywordUtil

import testlink.api.java.client.TestLinkAPIClient
import testlink.api.java.client.TestLinkAPIException

public class TestlinkKeywords {
	static BundleSettingStore bundleSetting
	static String TESTLINK_KEY
	static String TESTLINK_URI
	static String PROJECT_NAME
	static String TEST_PLAN_NAME
	static String BUILD_NAME

	static {
		try {
			bundleSetting = new BundleSettingStore(RunConfiguration.getProjectDir(), 'com.kms.katalon.keyword.Testlink-Keywords', true)
			TESTLINK_KEY = bundleSetting.getString('1f9bfb5ea7e3be72ee2b12f3501148e4', '1f9bfb5ea7e3be72ee2b12f3501148e4')
			if (StringUtils.isBlank(TESTLINK_KEY)) {
				KeywordUtil.logInfo("Testlink's Key is missing.dsfd")
				throw new IllegalStateException("Testlink's Key is missing.")
			}
			TESTLINK_URI = bundleSetting.getString('http://localhost/testlink/lib/api/xmlrpc/v1/xmlrpc.php', 'http://localhost/testlink/lib/api/xmlrpc/v1/xmlrpc.php')
			if (StringUtils.isBlank(TESTLINK_URI)) {
				KeywordUtil.logInfo("Testlink Url is missing.")
				throw new IllegalStateException("Testlink Url is missing.")
			}
			PROJECT_NAME = bundleSetting.getString('shopIt', 'shopIt')
			if (StringUtils.isBlank(PROJECT_NAME)) {
				KeywordUtil.logInfo("Project Name is missing.")
				throw new IllegalStateException("Project Name is missing.")
			}
			TEST_PLAN_NAME = bundleSetting.getString('shop TestPlan', 'shop TestPlan')
			if (StringUtils.isBlank(TEST_PLAN_NAME)) {
				KeywordUtil.logInfo("Test Plan Name is missing.")
				throw new IllegalStateException("Test Plan Name is missing.")
			}
			BUILD_NAME = bundleSetting.getString('shopIt authentification', 'shopIt authentification')
			if (StringUtils.isBlank(BUILD_NAME)) {
				KeywordUtil.logInfo("Build Name is missing.")
				throw new IllegalStateException("Build Name is missing.")
			}
		} catch (Exception e) {
			e.printStackTrace()
			throw e
		}
	}
	/**
	 * Update result to testlink.
	 *
	 * @param testcaseName The test case name on testlink.
	 * @param exception The exception message if any
	 * @param results The result of the test case
	 */
	@Keyword
	static updateResults(String testcaseName, String exception, String results) throws TestLinkAPIException{
		TestLinkAPIClient testLink = new TestLinkAPIClient(TESTLINK_KEY, TESTLINK_URI)
		testLink.reportTestCaseResult(PROJECT_NAME, TEST_PLAN_NAME, testcaseName, BUILD_NAME, exception, results)
	}
}
