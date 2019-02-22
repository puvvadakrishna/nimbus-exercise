package com.example.demo.codeexamples;

public class examples {

	@Configs({
			@Config(url = "/.d/.m/sampleCoreChangLogEntityNested/nestedStatus/_update?rawPayload=\"Test_Nested_Status\""),
			@Config(url = "/.d/_process?fn=_setByRule&&rule=stateless_changelog_entityA"),
			@Config(url = "/p/samplechangelogview_b/_new?fn=_initEntity&target=/.m/status&json=\"Test_Status_B\""),

	})

	@Config(url = "/_process?fn=_setByRule&rule=setByRuleDecisionTable&associatedParam=/p/decisiontabletestcoremodel:<!/../associatedParamId!>/_get")
	private String attr2;

	@Config(url = "/p/samplechangelogcore_b/_new?fn=_initEntity&target=/status&json=\"Test_Status_B\"&target=/sampleCoreChangLogEntityNestedB/nestedStatus&json=\"Test_Nested_Status_B\"")
	private String action_createEntityB;

}
