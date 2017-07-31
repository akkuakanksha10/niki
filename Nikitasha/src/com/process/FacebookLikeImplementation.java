package com.process;

import java.util.List;

import com.dao.RestFactory;
import com.dao.SeqController;
import com.model.Employee;
import com.model.FacebookLike;
import com.model.Seq;

public class FacebookLikeImplementation extends RestFactory{
	private RestFactory factory;
	private SeqController controller;
	
	public FacebookLike saveFacebookLike(FacebookLike facebookLike){
		try {
			Seq s=controller.findFacebookLikeSequence();
			facebookLike.setFacebookLikeId(s.getKey());
			s.increment();
			factory.update(s);
			factory.save(facebookLike);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return facebookLike;
	}
	public FacebookLike updateFacebookLike(FacebookLike facebookLike){
		try {
			factory.update(facebookLike);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return facebookLike;
	}
	public List<FacebookLike> getFacebookLikes(){
		try {
			List<FacebookLike> fbLikeList=(List<FacebookLike>)factory.getObjectList(FacebookLike.class);
			return fbLikeList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
}
