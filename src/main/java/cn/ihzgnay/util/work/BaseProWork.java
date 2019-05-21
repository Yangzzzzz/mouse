package cn.ihzgnay.util.work;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author yangzhi
 */
public class BaseProWork<T, R> implements ProWork<T,R> {

    /**
     * 存放处理结果
     */
    private LinkedList<ProResult<R>> resultLinkedList;
    /**
     * 存放待处理数据
     */
    private LinkedList<T> dataList;
    /**
     * 处理器
     */
    private Processor<T, R> processor;
    /**
     * 工作数量
     */
    private AtomicInteger workCount;
    /**
     * 成功数量
     */
    private AtomicInteger successCount;

    /**
     * 唯一id
     */
    private String workId;



    public BaseProWork(Processor processor,String workId) {
        this.processor = processor;
        this.workId = workId;
    }


    @Override
    public List<ProResult<R>> getResults() {
        return resultLinkedList;
    }

    @Override
    public boolean addProData(T data) {
        return dataList.add(data);
    }
}
