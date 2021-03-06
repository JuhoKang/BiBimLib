package kr.re.ec.bibim.vowrapper;


import kr.re.ec.bibim.vo.FolderData;
import kr.re.ec.bibim.vo.NoteData;
import kr.re.ec.bibim.vo.UserData;

public class WrappedClassOpener {
	
	//for singleton
		private static WrappedClassOpener instance = null;
		
		//for singleton
		static{
			try{
				instance = new WrappedClassOpener();
			} catch(Exception e){
				throw new RuntimeException("singleton instance intialize error");
			}
		}
		
		//for singleton
		private WrappedClassOpener(){
		}
		
		//for singleton
		public static WrappedClassOpener getInstance(){
			return instance;
		}
	
	public UserData OpenUserDataWrapper(UserDataWrapper udw){
		UserData ud = new UserData();
		
		ud.setUserid(udw.getUserid());
		ud.setName(udw.getName());
		ud.setPassword(udw.getPassword());
		
		return ud;
	}
	
	public FolderData OpenFolderDataWrapper(FolderDataWrapper fdw){
		FolderData fd = new FolderData();
		
		fd.setFolderid(fdw.getFolderid());
		fd.setName(fdw.getName());
		fd.setUserid(fdw.getUserid());
		
		return fd;
	}
	
	public NoteData OpenNoteDataWrapper(NoteDataWrapper ndw){
		NoteData nd = new NoteData();
		
		nd.setUserid(ndw.getUserid());
		nd.setFolderid(ndw.getFolderid());
		nd.setTitle(ndw.getTitle());
		nd.setContent(ndw.getContent());
		nd.setDate(ndw.getDate());
		nd.setNoteid(ndw.getNoteid());
		
		return nd;
	}

}
