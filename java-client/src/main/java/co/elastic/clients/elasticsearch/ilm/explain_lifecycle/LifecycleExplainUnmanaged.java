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

package co.elastic.clients.elasticsearch.ilm.explain_lifecycle;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ilm.explain_lifecycle.LifecycleExplainUnmanaged

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ilm.explain_lifecycle.LifecycleExplainUnmanaged">API
 *      specification</a>
 */
@JsonpDeserializable
public class LifecycleExplainUnmanaged implements LifecycleExplainVariant, JsonpSerializable {
	private final String index;

	// ---------------------------------------------------------------------------------------------

	private LifecycleExplainUnmanaged(Builder builder) {

		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");

	}

	public static LifecycleExplainUnmanaged of(Function<Builder, ObjectBuilder<LifecycleExplainUnmanaged>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * LifecycleExplain variant kind.
	 */
	@Override
	public LifecycleExplain.Kind _lifecycleExplainKind() {
		return LifecycleExplain.Kind.False;
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("managed", "false");

		generator.writeKey("index");
		generator.write(this.index);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LifecycleExplainUnmanaged}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<LifecycleExplainUnmanaged> {
		private String index;

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link LifecycleExplainUnmanaged}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LifecycleExplainUnmanaged build() {
			_checkSingleUse();

			return new LifecycleExplainUnmanaged(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LifecycleExplainUnmanaged}
	 */
	public static final JsonpDeserializer<LifecycleExplainUnmanaged> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, LifecycleExplainUnmanaged::setupLifecycleExplainUnmanagedDeserializer);

	protected static void setupLifecycleExplainUnmanagedDeserializer(
			ObjectDeserializer<LifecycleExplainUnmanaged.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");

		op.ignore("managed");
	}

}
