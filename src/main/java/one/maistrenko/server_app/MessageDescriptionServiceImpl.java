package one.maistrenko.server_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class MessageDescriptionServiceImpl {

    @Autowired
    private MessageDescriptionRepository messageDescriptionRepository;

    public MessageDescription updateMessageDescription(MessageDescription messageDescription) throws Exception {
        MessageDescription fromDB = messageDescriptionRepository.findById(messageDescription.getId())
                .orElseThrow(() -> new Exception("Message is missing"));
        fromDB.setReceiveTime(LocalDateTime.now());
        return messageDescriptionRepository.saveAndFlush(fromDB);

    }
}
