package exam.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import exam.config.kafka.KafkaProcessor;
import exam.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    UserAnsweredRepository userAnsweredRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ExamCanceled'"
    )
    public void wheneverExamCanceled_CancelExam(
        @Payload ExamCanceled examCanceled
    ) {
        ExamCanceled event = examCanceled;
        System.out.println(
            "\n\n##### listener CancelExam : " + examCanceled + "\n\n"
        );

        // Sample Logic //
        UserAnswered.cancelExam(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ExamDemanded'"
    )
    public void wheneverExamDemanded_OpenExam(
        @Payload ExamDemanded examDemanded
    ) {
        ExamDemanded event = examDemanded;
        System.out.println(
            "\n\n##### listener OpenExam : " + examDemanded + "\n\n"
        );

        // Sample Logic //
        UserAnswered.openExam(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
