package ua.edu.ucu.apps.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class MailInfo {
    private Client client;
    private MailCode mailCode;
}
