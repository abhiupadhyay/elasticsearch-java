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

package co.elastic.clients.elasticsearch.slm;

import co.elastic.clients.elasticsearch._types.LifecycleOperationMode;
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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: slm.get_status.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#slm.get_status.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetSlmStatusResponse implements JsonpSerializable {
	private final LifecycleOperationMode operationMode;

	// ---------------------------------------------------------------------------------------------

	private GetSlmStatusResponse(Builder builder) {

		this.operationMode = ApiTypeHelper.requireNonNull(builder.operationMode, this, "operationMode");

	}

	public static GetSlmStatusResponse of(Function<Builder, ObjectBuilder<GetSlmStatusResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code operation_mode}
	 */
	public final LifecycleOperationMode operationMode() {
		return this.operationMode;
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

		generator.writeKey("operation_mode");
		this.operationMode.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetSlmStatusResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetSlmStatusResponse> {
		private LifecycleOperationMode operationMode;

		/**
		 * Required - API name: {@code operation_mode}
		 */
		public final Builder operationMode(LifecycleOperationMode value) {
			this.operationMode = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetSlmStatusResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetSlmStatusResponse build() {
			_checkSingleUse();

			return new GetSlmStatusResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetSlmStatusResponse}
	 */
	public static final JsonpDeserializer<GetSlmStatusResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetSlmStatusResponse::setupGetSlmStatusResponseDeserializer);

	protected static void setupGetSlmStatusResponseDeserializer(ObjectDeserializer<GetSlmStatusResponse.Builder> op) {

		op.add(Builder::operationMode, LifecycleOperationMode._DESERIALIZER, "operation_mode");

	}

}
