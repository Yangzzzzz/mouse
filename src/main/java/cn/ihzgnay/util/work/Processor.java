package cn.ihzgnay.util.work;

public interface Processor<T, R> {

    ProResult<R> execute(T proData);

}
