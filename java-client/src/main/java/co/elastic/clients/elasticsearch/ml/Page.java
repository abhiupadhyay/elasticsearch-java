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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.Page

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml._types.Page">API
 *      specification</a>
 */
@JsonpDeserializable
public class Page implements JsonpSerializable {
	@Nullable
	private final Integer from;

	@Nullable
	private final Integer size;

	// ---------------------------------------------------------------------------------------------

	private Page(Builder builder) {

		this.from = builder.from;
		this.size = builder.size;

	}

	public static Page of(Function<Builder, ObjectBuilder<Page>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Skips the specified number of items.
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public final Integer from() {
		return this.from;
	}

	/**
	 * Specifies the maximum number of items to obtain.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final Integer size() {
		return this.size;
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

		if (this.from != null) {
			generator.writeKey("from");
			generator.write(this.from);

		}
		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Page}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Page> {
		@Nullable
		private Integer from;

		@Nullable
		private Integer size;

		/**
		 * Skips the specified number of items.
		 * <p>
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * Specifies the maximum number of items to obtain.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Page}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Page build() {
			_checkSingleUse();

			return new Page(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Page}
	 */
	public static final JsonpDeserializer<Page> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Page::setupPageDeserializer);

	protected static void setupPageDeserializer(ObjectDeserializer<Page.Builder> op) {

		op.add(Builder::from, JsonpDeserializer.integerDeserializer(), "from");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");

	}

}
