/*
 * Copyright 2008-2009 the original ������(zyc@hasor.net).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.hasor.jdbc.datasource;
import java.sql.SQLException;
import javax.sql.DataSource;
/**
 * 
 * @version : 2013-12-2
 * @author ������(zyc@hasor.net)
 */
public interface SavepointDataSourceHelper extends DataSourceHelper {
    /**��ȡSavepointManager*/
    public SavepointManager getSavepointManager(DataSource dataSource) throws SQLException;
}