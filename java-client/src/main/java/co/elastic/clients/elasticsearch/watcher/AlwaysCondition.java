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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.InstanceDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

public class AlwaysCondition implements Condition, JsonpSerializable {

	/**
	 * {@link Condition} variant type
	 */
	@Override
	public String _type() {
		return "always";
	}

	public static final class Builder implements ObjectBuilder<AlwaysCondition> {
		@Override
		public AlwaysCondition build() {
			return AlwaysCondition.INSTANCE;
		}
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject(_type());

		generator.writeStartObject();
		generator.writeEnd();
		generator.writeEnd();

	}

	/**
	 * Singleton instance for {@link AlwaysCondition}.
	 */
	public static final AlwaysCondition INSTANCE = new AlwaysCondition();

	public static final JsonpDeserializer<AlwaysCondition> DESERIALIZER = JsonpDeserializer
			.emptyObject(AlwaysCondition.INSTANCE);

	public static final InstanceDeserializer<AlwaysCondition.Builder, AlwaysCondition.Builder> $BUILDER_DESERIALIZER = ObjectBuilderDeserializer
			.createForBuilder(b -> {
			});

}
