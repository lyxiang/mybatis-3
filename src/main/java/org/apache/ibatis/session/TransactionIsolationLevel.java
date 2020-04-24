/**
 * Copyright 2009-2018 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ibatis.session;

import java.sql.Connection;

/**
 * @author Clinton Begin
 */
public enum TransactionIsolationLevel {

	/**
	 * 无事务
	 */
	NONE(Connection.TRANSACTION_NONE),

	/**
	 * 禁止脏读，但允许不可重复读和幻读
	 */
	READ_COMMITTED(Connection.TRANSACTION_READ_COMMITTED),

	/**
	 * 允许脏读、不可重复读和幻读
	 */
	READ_UNCOMMITTED(Connection.TRANSACTION_READ_UNCOMMITTED),

	/**
	 * 禁止脏读和不可重复读，单运行幻读
	 */
	REPEATABLE_READ(Connection.TRANSACTION_REPEATABLE_READ),

	/**
	 * 禁止脏读、不可重复读和幻读
	 */
	SERIALIZABLE(Connection.TRANSACTION_SERIALIZABLE);

	private final int level;

	TransactionIsolationLevel(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}
}
