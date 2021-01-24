# Projet IDM (DSL for ML Regression)
----
## Groupe
- Kevin Marquer
- Kounadi Ouattara
- Léo Rauzier


----

## Importation du projet dans Eclipse

### étapes

- importer dans eclipse tout les sous projets un par un
    - ```m2_idm_project```
    - ```m2_idm_project.tests```
    - ```m2_idm_project.ui```
    - ```m2_idm_project.ui.tests```
    - ```m2_idm_project.ide```

- les projets ```m2_idm_project``` et ```m2_idm_project.tests``` généreront des erreurs à cette étape, c'est normal

- Convertir les projets ```m2_idm_project``` et ```m2_idm_project.tests``` en projet Xtext
    - clique droit sur le projet > Configure > Convert to Xtext project

- Et voilà !
----

## Programme mlreg

### Structure

- **le choix du langage** (optionel) *[Python par défaut]*
    - python
    - r
- **le chemin du dataset**
- **le choix des colonnes** (optionel)
    - les colonnes prédictives *[toutes les colonnes sauf la dernière par défaut]*
    - les colonnes cibles *[la dernière colonne par défaut]*
- **le type d'évaluation** 
    - partition (avec la proportion de données de tests en paramètre)
    - cross-validation (avec le nombre de coupes en paramètre)
- **l'algorithme**
    - line_regress
    - decision_tree_regressor
    - svr
- **le calcul**
    - mean_squared_error
    - mean_absolute_error
    - median_absolute_error

### Exemple

```
target_language : r;
import : "soccer.csv";
predictive_vars : ,"odds_ft_draw","odds_ft_away_team_win";
target_vars : ,"odds_ft_home_team_win";
partition : 20%;
algorithm : line_regress;
calculate : mean_squared_error;
loop : 10;
```

----


## Diagrammes

### Méta modèle

![plot](meta_model.png)


#### Compilateurs + interpréteurs
![plot](diagram_compilator.png)

- l'interpréteur créé un générateur de code dans la méthodes ```createGenerator```

----

## Faire des tests avec docker


### Description
Dans le répertoire docker : 
- Deux fichiers DockerFile : ```DockerFileP``` pour python et ```DockerFileR``` pour R
- Un fichier jar pour l'interpréteur ```mlreg.jar```

### Lancement
- Builder les dockerfiles (les dockerfile respectifs copient le fichier mlreg.jar au sein du repertoire ```home/py_user/WORKDIR```) ;
	
- Une fois lancé, il faut copier le repertoire datas contenant le dataset puis copier également dans le benchmark dans ```home/py_user/WORKDIR``` ;
		
- Copier enfin le fichier lanceur_py.sh permettant de lancer tous les programmes de test écrits (qui utilisent le même dataset) ;
	
-  Rendre le ```lanceur_py.sh``` exécutable ```chmod ugo+x lanceur_py.sh``` ;
	
- Exécuter ```lanceur_py.sh``` ;
	
- Les résultats sont sauvés dans le dossier resultat_py (resp resultat_r pour le R) ;

- Reprendre les mêmes étapes pour le R depuis le build de l’image correspondante

- ```docker build -f DockerFileP -t mlreg_python:1.0``` .
- ```docker build -f DockerFileR -t mlreg_r:1.0``` .


### Lancer un programme

- Utiliser l'interpréteur avec la commande ```java -jar mlreg.jar [chemin-fichier-mlreg] ([chemin-fichier-resultats])?```
- Le deuxième argument sert à spécifier le fichier oû sera stocké les résultats.
- Le deuxième argument n'est pas obligatoire
- Si le deuxième argument n'est pas renseigné, le résultat s'affichera dans la console

----