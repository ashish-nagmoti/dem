% Facts: Parent relationships and gender relationships
parent(john, ann).
parent(john, bob).
parent(mary, ann).
parent(mary, bob).

male(john).
female(ann).
female(mary).

% Rules: Define half_sister relationship
half_sister(X, Y) :-
    parent(Z, X),      % X shares a parent Z
    parent(Z, Y),      % Y shares the same parent Z
    X \= Y,            % X and Y are different individuals
    female(X),        % X is female
    female(Y).        % Y is female

% Example usage:
% half_sister(ann, bob) returns true, as Ann and Bob share the same parent John
% half_sister(ann, ann) returns false, as an individual cannot be their own half-sister
