library(caret,warn.conflicts=FALSE)
library(gencve)
datas=read.csv(file="soccer.csv",sep=",")
for(i in 1:100){
	pred_cols=c("odds_ft_draw","odds_ft_away_team_win")
	target_cols=c("odds_ft_home_team_win")
	predict_formula=paste(pred_cols,collapse="+")
	target_formula=paste(target_cols,collapse="+")
	formula=as.formula(paste(paste(target_formula,"~"),predict_formula))
	trains_control=trainControl(method="cv",number=5,savePredictions=TRUE)
	model=train(formula,data=datas, method="svmLinear",trControl=trains_control)
	predict=model$pred$pred
	result=mae(as.matrix(model$pred$obs),as.matrix(predict))
	print(result)
}
