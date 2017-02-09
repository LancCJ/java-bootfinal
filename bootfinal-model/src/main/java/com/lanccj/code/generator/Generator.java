/**
 * Copyright (c) 2015-2016, LancCJ 陈健
 *
 * Licensed under the GNU Lesser General Public License (LGPL) ,Version 3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.lanccj.code.generator;

public class Generator {

	public static void main(String[] args) {
		
		String modelPackage = "com.lanccj";
		
		String dbHost = "127.0.0.1";
		String dbName = "jpress";
		String dbUser = "root";
		String dbPassword = "";
		
		new JGenerator(modelPackage, dbHost, dbName, dbUser, dbPassword).doGenerate();

	}

}