package heap.stark;


import java.util.List;


/**
 * Created by WZL on 2018/3/25.
 */
public class Starter {

    public static void start(String path, String tableName,String pojoName) throws Exception {
        List<PojoField> pojoFieldList = TableUtils.getPojoFieldList(tableName);
        Configure.openComment().openSetGet();

        POJOUtil.startCreatePOJO(path, pojoName,pojoFieldList);
        DAOUtil.startCreateDAO(path, tableName,pojoName,pojoFieldList);
    }

}
