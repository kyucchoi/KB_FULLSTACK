package org.scoula.studentscore.command;

import org.scoula.lib.cli.command.Command;

public class GetScoresCommand implements Command {
    @Override
    public void execute() {
        System.out.println("점수 입력");
    }
}