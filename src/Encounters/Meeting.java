package Encounters;

import Controllers.MeetingController;

import java.util.ArrayList;
import java.util.List;

public class Meeting {

    Date date;
    List<String> acceptedParticipants;
    List<String> sendTo;
    String sender;

    public Meeting(Date date, String sender, List<String> sendTo, MeetingController meetingController) {
        this.date = date;
        this.acceptedParticipants = new ArrayList<>();
        this.sendTo = sendTo;
        this.sender = sender;
        meetingController.addMeeting(this);
    }

    public Meeting(String sender, Date date, List<String> acceptedParticipants, List<String> sendTo) {
        this.date = date;
        this.acceptedParticipants = acceptedParticipants;
        this.sendTo = sendTo;
        this.sender = sender;
    }

    public String getSender(){
        return sender;
    }

    public Date getDate(){
        return date;
    }

    //confirma que un participante estuvo
    public void confirmParticipant(String citizenCuil){
        if(sendTo.contains(citizenCuil)){
            acceptedParticipants.add(citizenCuil);
            sendTo.remove(citizenCuil);
        }
    }

    //rechaza que un participante estuvo
    public void declineParticipation(String citizenCuil){
        if(sendTo.contains(citizenCuil)){
            sendTo.remove(citizenCuil);
        }
    }

    public List<String> getSendTo(){
        return sendTo;
    }

    public List<String> getAcceptedParticipants(){
        return acceptedParticipants;
    }




}
