package huaxin.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Descrition
 * @Author xiagf
 * @Date 2021/8/24 17:24
 * @Version 1.0
 */
@Aspect
@Component
public class DataSourceAop {
    @Pointcut("!@annotation(huaxin.annotation.Master) " +
            "&& (execution(* huaxin.service.*.select*(..)) " +
            "|| execution(* huaxin.service..*.find*(..)))")
    public void readPointcut() {

    }

    @Pointcut("@annotation(huaxin.annotation.Master) " +
            "|| execution(* huaxin.service..*.insert*(..)) " +
            "|| execution(* huaxin.service..*.add*(..)) " +
            "|| execution(* huaxin.service..*.update*(..)) " +
            "|| execution(* huaxin.service..*.edit*(..)) " +
            "|| execution(* huaxin..*.delete*(..)) " +
            "|| execution(* huaxin..*.remove*(..))")
    public void writePointcut() {

    }

    @Before("readPointcut()")
    public void read() {
        DBContextHolder.slave();
    }

    @Before("writePointcut()")
    public void write() {
        DBContextHolder.master();
    }

}
