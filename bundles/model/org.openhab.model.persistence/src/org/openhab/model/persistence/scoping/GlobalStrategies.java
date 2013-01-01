/**
 * openHAB, the open Home Automation Bus.
 * Copyright (C) 2010-2013, openHAB.org <admin@openhab.org>
 *
 * See the contributors.txt file in the distribution for a
 * full listing of individual contributors.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see <http://www.gnu.org/licenses>.
 *
 * Additional permission under GNU GPL version 3 section 7
 *
 * If you modify this Program, or any covered work, by linking or
 * combining it with Eclipse (or a modified version of that library),
 * containing parts covered by the terms of the Eclipse Public License
 * (EPL), the licensors of this Program grant you additional permission
 * to convey the resulting work.
 */
package org.openhab.model.persistence.scoping;

import org.openhab.model.persistence.persistence.Strategy;
import org.openhab.model.persistence.persistence.impl.StrategyImpl;

/**
 * This class defines a few persistence strategies that are globally available to
 * all persistence models.
 * 
 * @author Kai Kreuzer
 * @since 1.0.0
 *
 */
public class GlobalStrategies {

	static final public Strategy UPDATE = new StrategyImpl() {
		public String getName() {
			return "everyUpdate";
		};
	};

	static final public Strategy CHANGE = new StrategyImpl() {
		public String getName() {
			return "everyChange";
		};
	};

	static final public Strategy RESTORE = new StrategyImpl() {
		public String getName() {
			return "restoreOnStartup";
		};
	};
}
