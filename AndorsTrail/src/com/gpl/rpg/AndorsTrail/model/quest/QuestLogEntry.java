package com.gpl.rpg.AndorsTrail.model.quest;

public final class QuestLogEntry {
	public final int progress;
	public final String logtext;
	public final int rewardExperience;
    public final int removeQuestProgress;
	public final boolean finishesQuest;

	public QuestLogEntry(
			int progress
			, String logtext
			, int rewardExperience
            , int removeQuestProgress
			, boolean finishesQuest
	) {
		this.progress = progress;
		this.logtext = logtext;
		this.rewardExperience = rewardExperience;
        this.removeQuestProgress = removeQuestProgress;
		this.finishesQuest = finishesQuest;
	}
}
