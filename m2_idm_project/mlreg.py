import pandas as pd
import numpy as np
from sklearn.svm import SVR
from sklearn.metrics import median_absolute_error
from sklearn.model_selection import cross_val_score
from sklearn import svm
from sklearn.model_selection import KFold
import random
datas=pd.read_csv("soccer.csv",sep=",")
for i in range(10):
	pred_cols=["odds_ft_draw","odds_ft_away_team_win"]
	target_cols=["odds_ft_home_team_win"]
	targs=datas[target_cols]
	preds=datas[pred_cols]
	targs=targs.values.ravel()
	algo=SVR()
	cv=KFold(n_splits=5,random_state=random.randint(1,100), shuffle=True)
	score=cross_val_score(algo,preds,targs,scoring="neg_median_absolute_error",cv=cv)
	result=abs(sum(score)/len(score))
	print(result)
