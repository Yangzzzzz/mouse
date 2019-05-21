package cn.ihzgnay.util.work;

import java.util.List;

/**
 * @author yangzhi
 */
public interface ProWork<T, R> {
    List<ProResult<R>> getResults();

    /**
     * 添加处理参数
     * @param data
     * @return
     */
    boolean addProData(T data);
}
