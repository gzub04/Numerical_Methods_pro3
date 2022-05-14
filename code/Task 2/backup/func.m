% requires x containing 2 values x(1) and x(2)
% variable t only for ode45 to work
function out = func(~, x)
    % outputs 2 values, one for the 1st equation and one for the 2nd one
    out = [x(2) + x(1)*(0.5 - x(1)^2 - x(2)^2); -x(1) + x(2)*(0.5 - x(1)^2 - x(2)^2)];
end