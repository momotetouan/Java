
# Algorithme de Détection de Cycles dans un Graphe Non Orienté en Java

Cet algorithme en Java permet de détecter la présence de cycles dans un graphe non orienté. Les cycles sont des boucles dans le graphe, c'est-à-dire des séquences de sommets connectés qui forment une boucle.

# Comment ça fonctionne
L'algorithme repose sur la recherche en profondeur (Depth-First Search, DFS). Voici comment il fonctionne :

Le graphe est représenté à l'aide de la classe Graph, où chaque sommet est un nœud et chaque arête est une connexion entre deux nœuds.
L'algorithme commence par marquer tous les nœuds du graphe comme "non visités".
Pour chaque nœud non visité, il lance une recherche DFS à partir de ce nœud.
Pendant la recherche DFS, il marque les nœuds visités et maintient une référence vers le nœud parent.
Si, à un moment donné, un nœud voisin est rencontré et qu'il est déjà visité mais qu'il n'est pas le parent du nœud actuel (c'est-à-dire qu'il n'est pas le nœud à partir duquel nous avons démarré la recherche DFS), alors cela signifie qu'un cycle a été trouvé, et l'algorithme s'arrête.
Si la recherche DFS se termine sans avoir trouvé de cycle pour un nœud donné, le processus est répété pour les nœuds non visités restants.
Si aucune détection de cycle n'est effectuée pendant tout le processus, le graphe est déclaré sans cycle.

# Utilisation
Pour utiliser cet algorithme, vous devez créer une instance de la classe Graph, ajouter des arêtes au graphe à l'aide de la méthode addEdge, puis appeler la méthode isCyclic pour vérifier la présence de cycles.

Voici un exemple d'utilisation :

Graph g = new Graph(5);
g.addEdge(1, 0);
g.addEdge(0, 2);
g.addEdge(2, 1);
g.addEdge(0, 3);
g.addEdge(3, 4);

if (g.isCyclic())
    System.out.println("Le graphe contient un cycle.");
else
    System.out.println("Le graphe ne contient pas de cycle.");

    
Cet algorithme est essentiel pour résoudre des problèmes de détection de cycles dans diverses applications, notamment en informatique, en réseaux et en modélisation de données.
