/*
 * TestAdditionalPropertiesSchema1.kt
 *
 * This code was generated by json-kotlin-schema-codegen - JSON Schema Code Generator
 * See https://github.com/pwall567/json-kotlin-schema-codegen
 *
 * It is not advisable to modify generated code as any modifications will be lost
 * when the generation process is re-run.
 */
package net.pwall.json.schema.codegen.test.kotlin

import java.time.LocalDate

/**
 * Test use of additionalProperties with schema.
 */
class TestAdditionalPropertiesSchema1(
    private val cg_map: Map<String, LocalDate>
) : Map<String, LocalDate> by cg_map {

    override fun toString(): String = "TestAdditionalPropertiesSchema1(${cg_map.entries.joinToString { "${it.key}=${it.value}" }})"

    override fun equals(other: Any?): Boolean = this === other || other is TestAdditionalPropertiesSchema1 && cg_map == other.cg_map

    override fun hashCode(): Int = cg_map.hashCode()

}
