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

package co.elastic.clients.elasticsearch.core;

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
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;

// typedef: _global.close_point_in_time.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#_global.close_point_in_time.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class ClosePointInTimeResponse implements JsonpSerializable {
	private final boolean succeeded;

	private final int numFreed;

	// ---------------------------------------------------------------------------------------------

	private ClosePointInTimeResponse(Builder builder) {

		this.succeeded = ApiTypeHelper.requireNonNull(builder.succeeded, this, "succeeded");
		this.numFreed = ApiTypeHelper.requireNonNull(builder.numFreed, this, "numFreed");

	}

	public static ClosePointInTimeResponse of(Function<Builder, ObjectBuilder<ClosePointInTimeResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code succeeded}
	 */
	public final boolean succeeded() {
		return this.succeeded;
	}

	/**
	 * Required - API name: {@code num_freed}
	 */
	public final int numFreed() {
		return this.numFreed;
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

		generator.writeKey("succeeded");
		generator.write(this.succeeded);

		generator.writeKey("num_freed");
		generator.write(this.numFreed);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClosePointInTimeResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ClosePointInTimeResponse> {
		private Boolean succeeded;

		private Integer numFreed;

		/**
		 * Required - API name: {@code succeeded}
		 */
		public final Builder succeeded(boolean value) {
			this.succeeded = value;
			return this;
		}

		/**
		 * Required - API name: {@code num_freed}
		 */
		public final Builder numFreed(int value) {
			this.numFreed = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ClosePointInTimeResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClosePointInTimeResponse build() {
			_checkSingleUse();

			return new ClosePointInTimeResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClosePointInTimeResponse}
	 */
	public static final JsonpDeserializer<ClosePointInTimeResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ClosePointInTimeResponse::setupClosePointInTimeResponseDeserializer);

	protected static void setupClosePointInTimeResponseDeserializer(
			ObjectDeserializer<ClosePointInTimeResponse.Builder> op) {

		op.add(Builder::succeeded, JsonpDeserializer.booleanDeserializer(), "succeeded");
		op.add(Builder::numFreed, JsonpDeserializer.integerDeserializer(), "num_freed");

	}

}
