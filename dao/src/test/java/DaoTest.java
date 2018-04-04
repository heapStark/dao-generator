import com.alibaba.druid.pool.DruidDataSource;
import heap.stark.PoolUtils;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by WZL on 2018/3/25.
 */
public class DaoTest {
    @Test
    public void testGetPool() throws Exception{
        DruidDataSource dataSource = PoolUtils.getPool();
        assertNotNull(dataSource);
    }

}
