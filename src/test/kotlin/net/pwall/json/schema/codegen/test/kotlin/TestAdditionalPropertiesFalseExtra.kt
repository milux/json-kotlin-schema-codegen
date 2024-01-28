/*
 * TestAdditionalPropertiesFalseExtra.kt
 *
 * This code was generated by json-kotlin-schema-codegen - JSON Schema Code Generator
 * See https://github.com/pwall567/json-kotlin-schema-codegen
 *
 * It is not advisable to modify generated code as any modifications will be lost
 * when the generation process is re-run.
 */
package net.pwall.json.schema.codegen.test.kotlin

/**
 * Test use of additionalProperties false with extra fields.
 */
data class TestAdditionalPropertiesFalseExtra(
    val extra: String
) {

    init {
        require(extra.isNotEmpty()) { "extra length < minimum 1 - ${extra.length}" }
    }

}
