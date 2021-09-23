/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.InstanceDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;

import java.util.EnumSet;
import java.util.Objects;

public class SpanGapQuery implements SpanQuery {

	private final String field;

	private final int spanWidth;

	@Override
	public String _type() {
		return "span_gap";
	}

	public SpanGapQuery(SpanGapQuery.Builder builder) {
		this.field = Objects.requireNonNull(builder.field, "field");
		this.spanWidth = Objects.requireNonNull(builder.spanWidth, "span_width");
	}

	public String field() {
		return this.field;
	}

	public int spanWidth() {
		return this.spanWidth;
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject(_type());
		generator.write(this.field, this.spanWidth);
		generator.writeEnd();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SpanGapQuery}.
	 */
	public static class Builder implements ObjectBuilder<SpanGapQuery> {

		private String field;
		private Integer spanWidth;

		public SpanGapQuery.Builder field(String value) {
			this.field = value;
			return this;
		}

		public SpanGapQuery.Builder spanWidth(int value) {
			this.spanWidth = value;
			return this;
		}

		@Override
		public SpanGapQuery build() {
			return new SpanGapQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	// Internal - Deserializer for variant builder
	public static final InstanceDeserializer<SpanGapQuery.Builder, SpanGapQuery.Builder> $BUILDER_DESERIALIZER = InstanceDeserializer
			.of((value, parser, mapper, event) -> {
				JsonpUtils.expectNextEvent(parser, JsonParser.Event.KEY_NAME);
				String name = parser.getString();

				JsonpUtils.expectKeyName(parser, JsonParser.Event.VALUE_NUMBER);
				int spanWidth = parser.getInt();

				JsonpUtils.expectNextEvent(parser, JsonParser.Event.END_OBJECT);

				return value.field(name).spanWidth(spanWidth);
			});

}
