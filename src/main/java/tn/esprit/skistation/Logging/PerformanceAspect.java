package tn.esprit.skistation.Logging;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class PerformanceAspect {
    @Around("execution (* tn.esprit.skistation.Services.Imp.ICoursServiceImp.*(..))")
    public Object executionTime(ProceedingJoinPoint pjp) throws Throwable {
        long t1 = System.currentTimeMillis();
//List<object> obj = new ArrayList<Object>(); // si Le type de cetour est une liste
        Object obj = pjp.proceed();
        long executionTime = System.currentTimeMillis() - t1;
        String methodName = pjp.getSignature().getName();
        log.info("The runtime of the method ( " + methodName + " ) = " + executionTime + " milliseconds.");
        return obj;
    }
}
