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
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.post_calendar_events.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml.post_calendar_events.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class PostCalendarEventsResponse implements JsonpSerializable {
	private final List<CalendarEvent> events;

	// ---------------------------------------------------------------------------------------------

	private PostCalendarEventsResponse(Builder builder) {

		this.events = ApiTypeHelper.unmodifiableRequired(builder.events, this, "events");

	}

	public static PostCalendarEventsResponse of(Function<Builder, ObjectBuilder<PostCalendarEventsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code events}
	 */
	public final List<CalendarEvent> events() {
		return this.events;
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

		if (ApiTypeHelper.isDefined(this.events)) {
			generator.writeKey("events");
			generator.writeStartArray();
			for (CalendarEvent item0 : this.events) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PostCalendarEventsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<PostCalendarEventsResponse> {
		private List<CalendarEvent> events;

		/**
		 * Required - API name: {@code events}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>events</code>.
		 */
		public final Builder events(List<CalendarEvent> list) {
			this.events = _listAddAll(this.events, list);
			return this;
		}

		/**
		 * Required - API name: {@code events}
		 * <p>
		 * Adds one or more values to <code>events</code>.
		 */
		public final Builder events(CalendarEvent value, CalendarEvent... values) {
			this.events = _listAdd(this.events, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code events}
		 * <p>
		 * Adds a value to <code>events</code> using a builder lambda.
		 */
		public final Builder events(Function<CalendarEvent.Builder, ObjectBuilder<CalendarEvent>> fn) {
			return events(fn.apply(new CalendarEvent.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PostCalendarEventsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PostCalendarEventsResponse build() {
			_checkSingleUse();

			return new PostCalendarEventsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PostCalendarEventsResponse}
	 */
	public static final JsonpDeserializer<PostCalendarEventsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PostCalendarEventsResponse::setupPostCalendarEventsResponseDeserializer);

	protected static void setupPostCalendarEventsResponseDeserializer(
			ObjectDeserializer<PostCalendarEventsResponse.Builder> op) {

		op.add(Builder::events, JsonpDeserializer.arrayDeserializer(CalendarEvent._DESERIALIZER), "events");

	}

}
