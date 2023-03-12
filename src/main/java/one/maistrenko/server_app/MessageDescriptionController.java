package one.maistrenko.server_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/message")
public class MessageDescriptionController {
    @Autowired
    private MessageDescriptionServiceImpl messageDescriptionService;

    @RequestMapping(method = RequestMethod.POST, value = "update")
    public @ResponseBody MessageDescription updateInfo(@RequestBody MessageDescription messageDescription) throws Exception {
        return messageDescriptionService.updateMessageDescription(messageDescription);
    }
}

