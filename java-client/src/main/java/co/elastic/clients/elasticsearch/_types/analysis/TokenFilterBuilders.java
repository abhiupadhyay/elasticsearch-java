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

package co.elastic.clients.elasticsearch._types.analysis;

/**
 * Builders for {@link TokenFilter} variants.
 * <p>
 * Variants <code>name</code> are not available here as they don't have a
 * dedicated class. Use {@link TokenFilter}'s builder for these.
 * 
 */
public class TokenFilterBuilders {
	private TokenFilterBuilders() {
	}

	/**
	 * Creates a builder for the {@link TokenFilterDefinition definition}
	 * {@code TokenFilter} variant.
	 */
	public static TokenFilterDefinition.Builder definition() {
		return new TokenFilterDefinition.Builder();
	}

}
