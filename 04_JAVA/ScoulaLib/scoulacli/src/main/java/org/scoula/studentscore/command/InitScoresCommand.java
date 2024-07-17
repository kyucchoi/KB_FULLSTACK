package org.scoula.studentscore.command;

import org.scoula.lib.cli.command.Command;

public class InitScoresCommand implements Command {
    @Override
    public void execute() {
        System.out.println("학생수 초기화");
    }
}
