package Controllers;

import Encounters.Meeting;

import java.util.ArrayList;
import java.util.List;

public class MeetingController {

    List<Meeting> meetings;

    public MeetingController(){
        meetings = new ArrayList<>();
    }

    public List<Meeting> searchCitizenMeetingRequests(String cuil){
        List<Meeting> meetingsRecived = new ArrayList<>();
        for (int i = 0; i < meetings.size(); i++) {
            if(meetings.get(i).getSendTo().contains(cuil)){
                meetingsRecived.add(meetings.get(i));
            }
        }
        return meetingsRecived;
    }

    public List<Meeting> searchCitizenAcceptedRequests(String cuil){
        List<Meeting> meetingsAccepted = new ArrayList<>();
        for (int i = 0; i < meetings.size(); i++) {
            if(meetings.get(i).getAcceptedParticipants().contains(cuil)){
                meetingsAccepted.add(meetings.get(i));
            }
        }
        return meetingsAccepted;
    }

    public void addMeeting(Meeting meeting){
        meetings.add(meeting);
    }





}
