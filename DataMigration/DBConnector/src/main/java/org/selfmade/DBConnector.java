package org.selfmade;

import java.util.List;
import java.util.Map;

abstract class DBConnector {


    //abstract String makeConnect(String address, Integer port);

    abstract void insertData(String DB, String table,  List<Map<String,Object> > documentValues);





}


