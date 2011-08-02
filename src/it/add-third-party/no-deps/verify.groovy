/*
 * #%L
 * License Maven Plugin
 * 
 * $Id: verify.groovy 13433 2011-01-22 08:36:13Z tchemit $
 * $HeadURL: http://svn.codehaus.org/mojo/tags/license-maven-plugin-1.0-beta-2/src/it/add-third-party/no-deps/verify.groovy $
 * %%
 * Copyright (C) 2008 - 2011 CodeLutin, Codehaus, Tony Chemit
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */

file = new File(basedir, 'target/generated-sources/license/THIRD-PARTY.txt');
assert file.exists();
content = file.text;
assert content.contains('the project has no dependencies.');

file = new File(basedir, 'target/generated-sources/license/META-INF/test-add-third-party-no-deps-THIRD-PARTY.txt');
assert file.exists();
content = file.text;
assert content.contains('the project has no dependencies.');

return true;
