/*
 * #%L
 * License Maven Plugin
 *
 * $Id: verify.groovy 13519 2011-02-05 09:32:50Z tchemit $
 * $HeadURL: http://svn.codehaus.org/mojo/tags/license-maven-plugin-1.0-beta-2/src/it/update-file-header/extra-extension/verify.groovy $
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
file = new File(basedir, 'src/main/java/org/codehaus/license/plugin/test/MyBean.java');
assert file.exists();

content = file.text;
assert content.contains('Copyright (C) 2012 License Test');

file = new File(basedir, 'src/main/java/org/codehaus/license/plugin/test/MyBean2.java');
assert file.exists();

content = file.text;
assert content.contains('Copyright (C) 2010 Tony');
assert content.contains('do NOT update!');
assert !content.contains('Fake to be removed!');

file = new File(basedir, 'src/main/java/org/codehaus/license/plugin/test/MyBean3.java');
assert file.exists();

content = file.text;
assert content.contains(' * %%Ignore-License');
assert content.contains(' * yet another license');
assert content.contains(' * Copyright (C) 2000 Codelutin Do not update!');

file = new File(basedir, 'src/files/apt/index.apt');
assert file.exists();

content = file.text;
assert content.contains('Copyright (C)');
assert content.contains('~~ #%L');
assert content.contains('~~ #L%');
assert content.contains('$Id');
assert !content.contains('~~ ~~');


file = new File(basedir, 'src/files/apt/index2.apt');
assert file.exists();

content = file.text;
assert content.contains('Copyright (C)');
assert content.contains('~~ #%L');
assert content.contains('~~ #L%');
assert content.contains('$Id');
assert !content.contains('~~ ~~');


file = new File(basedir, 'src/files/rst/index.rst');
assert file.exists();

content = file.text;
assert content.contains('Copyright (C)');
assert content.contains('.. * #%L');
assert content.contains('.. * #L%');
assert content.contains('$Id');
assert !content.contains('.. * .. *');


file = new File(basedir, 'src/files/rst/index2.rst');
assert file.exists();

content = file.text;
assert content.contains('Copyright (C)');
assert content.contains('.. * #%L');
assert content.contains('.. * #L%');
assert content.contains('$Id');
assert !content.contains('.. * .. *');


file = new File(basedir, 'src/files/xml/test.xml');
assert file.exists();

content = file.text;
assert content.startsWith("<?xml version='1.0' encoding='UTF-8'?>");
assert content.contains('Copyright (C)');
assert content.contains('#%L');
assert content.contains('#L%');
assert content.contains('$Id');


file = new File(basedir, 'src/files/xml/test2.xml');
assert file.exists();

content = file.text;
assert content.startsWith("<?xml version='1.0' encoding='UTF-8'?>");
assert content.contains('Copyright (C)');
assert content.contains('#%L');
assert content.contains('#L%');
assert content.contains('$Id');

file = new File(basedir, 'src/files/properties/test.properties');
assert file.exists();

content = file.text;
assert content.contains('Copyright (C)');
assert content.contains('# #%L');
assert content.contains('# #L%');
assert !content.contains('# # \n');
assert content.contains('$Id');


file = new File(basedir, 'src/files/properties/test2.properties');
assert file.exists();

content = file.text;
assert content.contains('Copyright (C)');
assert content.contains('# #%L');
assert content.contains('# #L%');
assert content.contains('# #%L');
assert !content.contains('# # \n');
assert content.contains('$Id');

// test with extra mapping

file = new File(basedir, 'src/main/java/org/codehaus/license/plugin/test/MyBean.java2');
assert file.exists();

content = file.text;
assert content.contains('Copyright (C) 2012 License Test');

file = new File(basedir, 'src/main/java/org/codehaus/license/plugin/test/MyBean2.java2');
assert file.exists();

content = file.text;
assert content.contains('Copyright (C) 2010 Tony');
assert content.contains('do NOT update!');
assert !content.contains('Fake to be removed!');

file = new File(basedir, 'src/main/java/org/codehaus/license/plugin/test/MyBean3.java2');
assert file.exists();

content = file.text;
assert content.contains(' * %%Ignore-License');
assert content.contains(' * yet another license');
assert content.contains(' * Copyright (C) 2000 Codelutin Do not update!');

file = new File(basedir, 'src/files/apt/index.apt2');
assert file.exists();

content = file.text;
assert content.contains('Copyright (C)');
assert content.contains('~~ #%L');
assert content.contains('~~ #L%');
assert content.contains('$Id');
assert !content.contains('~~ ~~');


file = new File(basedir, 'src/files/apt/index2.apt2');
assert file.exists();

content = file.text;
assert content.contains('Copyright (C)');
assert content.contains('~~ #%L');
assert content.contains('~~ #L%');
assert content.contains('$Id');
assert !content.contains('~~ ~~');


file = new File(basedir, 'src/files/rst/index.rst2');
assert file.exists();

content = file.text;
assert content.contains('Copyright (C)');
assert content.contains('.. * #%L');
assert content.contains('.. * #L%');
assert content.contains('$Id');
assert !content.contains('.. * .. *');


file = new File(basedir, 'src/files/rst/index2.rst2');
assert file.exists();

content = file.text;
assert content.contains('Copyright (C)');
assert content.contains('.. * #%L');
assert content.contains('.. * #L%');
assert content.contains('$Id');
assert !content.contains('.. * .. *');


file = new File(basedir, 'src/files/xml/test.xml2');
assert file.exists();

content = file.text;
assert content.startsWith("<?xml version='1.0' encoding='UTF-8'?>");
assert content.contains('Copyright (C)');
assert content.contains('#%L');
assert content.contains('#L%');
assert content.contains('$Id');


file = new File(basedir, 'src/files/xml/test2.xml2');
assert file.exists();

content = file.text;
assert content.startsWith("<?xml version='1.0' encoding='UTF-8'?>");
assert content.contains('Copyright (C)');
assert content.contains('#%L');
assert content.contains('#L%');
assert content.contains('$Id');

file = new File(basedir, 'src/files/properties/test.properties2');
assert file.exists();

content = file.text;
assert content.contains('Copyright (C)');
assert content.contains('# #%L');
assert content.contains('# #L%');
assert !content.contains('# # \n');
assert content.contains('$Id');


file = new File(basedir, 'src/files/properties/test2.properties2');
assert file.exists();

content = file.text;
assert content.contains('Copyright (C)');
assert content.contains('# #%L');
assert content.contains('# #L%');
assert content.contains('# #%L');
assert !content.contains('# # \n');
assert content.contains('$Id');

return true;
