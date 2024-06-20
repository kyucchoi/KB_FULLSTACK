package access.quiz;

public class Speaker {
    private int volume;

    public Speaker() {
        this.volume = 20;
    }

    public void volumeUp() {
        if (this.volume >= 100) {
            System.out.println("더 이상 볼륨 조절이 불가능합니다");
        } else {
            this.volume += 1;
            System.out.println("현재 볼륨 : " + this.volume);
        }
    }

    public void volumeDown() {
        if (this.volume <= 0) {
            System.out.println("더 이상 볼륨 조절이 불가능합니다");
        } else {
            this.volume -= 1;
            System.out.println("현재 볼륨 : " + this.volume);
        }
    }

    public void mute() {
        this.volume = 0;
        System.out.println("스피커가 Mute 되었습니다");
    }
}
