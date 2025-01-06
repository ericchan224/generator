package com.ericchan.cli.pattern;

public class Client {
    public static void main(String[] args) {
        // 创建接收者对象
        Device tv = new Device("TV");
        Device stereo = new Device("Stereo");

        // 创建具体命令对象，可以绑定不同设备
        TurnOffCommand turnOff = new TurnOffCommand(stereo);
        TurnOnCommand turnOn = new TurnOnCommand(tv);

        // 创建调用者
        RemoteControl remoteControl = new RemoteControl();

        // 执行命令
        remoteControl.setCommand(turnOn);
        remoteControl.pressButton();
        remoteControl.setCommand(turnOff);
        remoteControl.pressButton();
    }
}
