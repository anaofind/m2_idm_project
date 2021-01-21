from sklearn.metrics import mean_absolute_error
from sklearn.model_selection import train_test_split
from sklearn.svm import SVR
import numpy as np
import pandas as pd
datas=pd.read_csv("soccer.csv",sep=",")
pred_cols=["odds_ft_draw","odds_ft_away_team_win"]
target_cols=["odds_ft_home_team_win"]
targs=datas[target_cols]
preds=datas[pred_cols]
targs=targs.values.ravel()
algo=SVR()
pred_train,pred_test,target_train,target_test=train_test_split(preds,targs,test_size=0.3)
algo.fit(pred_train,target_train)
predict=algo.predict(pred_test)
result=mean_absolute_error(target_test,predict)
print(result)
