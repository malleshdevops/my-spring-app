/*
 * Copyright 2012-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.docker.compose.service.connection.activemq;

import java.util.Map;

/**
 * ActiveMQ environment details.
 *
 * @author Stephane Nicoll
 * @author Eddú Meléndez
 */
class ActiveMQClassicEnvironment {

	private final String user;

	private final String password;

	ActiveMQClassicEnvironment(Map<String, String> env) {
		this.user = env.get("ACTIVEMQ_CONNECTION_USER");
		this.password = env.get("ACTIVEMQ_CONNECTION_PASSWORD");
	}

	String getUser() {
		return this.user;
	}

	String getPassword() {
		return this.password;
	}

}
