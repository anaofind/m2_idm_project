import pandas as pd
import numpy as np
from sklearn.svm import SVR
from sklearn.metrics import mean_absolute_error
from sklearn.model_selection import cross_val_score
from sklearn import svm
datas=pd.read_csv("soccer.csv",sep=",")
for i in range(3):
	pred_cols=["odds_ft_draw","odds_ft_away_team_win"]
	target_cols=["odds_ft_home_team_win"]
	targs=datas[target_cols]
	preds=datas[pred_cols]
	targs=targs.values.ravel()
	algo=SVR()
	result=cross_val_score(algo,preds,targs,scoring="neg_mean_absolute_error",cv=5)
	print(result)
